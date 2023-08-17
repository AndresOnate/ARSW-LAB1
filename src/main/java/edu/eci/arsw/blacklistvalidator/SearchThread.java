package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

import java.util.LinkedList;

public class SearchThread extends Thread{

    private int initialServer;
    private int endServer;
    private String ipaddress;
    private  LinkedList<Integer> blackListOcurrences= new LinkedList<>();


    public  SearchThread(int initialServer, int endServer, String ipaddress){
        this.initialServer = initialServer;
        this.endServer = endServer;
        this.ipaddress = ipaddress;
    }

    public void run() {
        HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
        for (int i=initialServer;i<endServer;i++){
            if (skds.isInBlackListServer(i, this.ipaddress)){
                blackListOcurrences.add(i);
            }
        }
    }

    public LinkedList<Integer> getBlackListOcurrences() {
        return blackListOcurrences;
    }

}
