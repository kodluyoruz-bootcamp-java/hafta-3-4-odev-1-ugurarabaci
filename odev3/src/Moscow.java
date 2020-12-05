public class Moscow extends City{
    public Moscow(String name, String cityCode, int gmt) {
        super(name, cityCode, gmt);
    }



    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCityCode() {
        return super.getCityCode();
    }

    @Override
    public final String setCityCode(String cityCode) {
        return "MOW";
    }

    @Override
    public int getGmt() {
        return super.getGmt();
    }

    @Override
    public void setGmt(int gmt) {
        super.setGmt(gmt);
    }
}
