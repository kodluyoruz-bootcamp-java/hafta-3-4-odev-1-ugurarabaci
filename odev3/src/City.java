import java.util.Comparator;

public class City implements Clock, Comparable<City> {



    private String name;
    private String cityCode;
    private int gmt;

    public City(String name, String cityCode, int gmt) {
        this.name = name;
        this.cityCode = cityCode;
        this.gmt = gmt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return cityCode;
    }


    public int getGmt() {
        return gmt;
    }

    @Override
    public String toString() {
        return
                "şehir kodu=" + cityCode +
                ", şehir=" + name;
    }

    public void setGmt(int gmt) {
        this.gmt = gmt;
    }

    @Override
    public void showTime() {

    }

    @Override
    public int compareTo(City c) {
        return this.name.compareTo(c.name);
    }
}
