package headfirst.designpatterns.factory.challenge;

public class ZoneFactory {
    public Zone createZone(String zoneId) {
        Zone zone = null;
        switch (zoneId) {
            case "US/Pacific":
                zone = new ZonePacific();
                break;
            case "US/Mountain":
                zone = new ZoneMountain();
                break;
            case "US/Central":
                zone = new ZoneCentral();
                break;
            case "US/Eastern":
                zone = new ZoneEastern();
                break;
        }
        return zone;
    }
}