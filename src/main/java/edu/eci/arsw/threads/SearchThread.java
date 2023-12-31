package edu.eci.arsw.threads;

import edu.eci.arsw.blacklistvalidator.HostBlackListsValidator;
import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

import java.util.LinkedList;

public class SearchThread extends Thread {

    private final int initialServer;
    private final int endServer;
    private final String ipaddress;
    private final LinkedList<Integer> blackListOcurrences = new LinkedList<>();
    private int ocurrencesCount;
    private int checkedListsCount;


    public SearchThread(int initialServer, int endServer, String ipaddress) {
        this.initialServer = initialServer;
        this.endServer = endServer;
        this.ipaddress = ipaddress;
    }

    @Override
    public void run() {
        HostBlacklistsDataSourceFacade skds = HostBlacklistsDataSourceFacade.getInstance();
        ocurrencesCount = 0;
        checkedListsCount = 0;

        for (int i = initialServer; i < endServer && ocurrencesCount < HostBlackListsValidator.BLACK_LIST_ALARM_COUNT; i++) {
            checkedListsCount++;
            if (skds.isInBlackListServer(i, this.ipaddress)) {
                blackListOcurrences.add(i);
                ocurrencesCount++;
            }
        }
    }

    public LinkedList<Integer> getBlackListOcurrences() {
        return blackListOcurrences;
    }

    public int getCheckedListsCount() {
        return checkedListsCount;
    }
}
