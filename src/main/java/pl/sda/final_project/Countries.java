package pl.sda.final_project;

public enum Countries {


    POLAND ("POLSKA", "PL"),
    GERMANY ("POLSKA", "PL"),
    ITALY ("POLSKA", "PL"),
    GREAT_BRITAIN ("WIELKA_BRYTANIA", "GB"),
    RUSSIA ("ROSJA", "RU"),
    UKRAINE ("UKRAINA", "UA"),
    SWEDEN ("SZWECJA", "SE"),
    DENMARK ("DANIA", "DK"),
    BELGIUM ("BELGIA", "BE"),
    FRANCE ("FRANCJA", "FR"),
    CZECHIA ("CZECHY", "CZ");

    private final String plName;
    private final String symbol;

    Countries (String plName, String symbol){
        this.plName=plName;
        this.symbol=plName;

    }

}
