package neuq.edu.pokerface.inquiry.model.tel;

import com.google.gson.annotations.Expose;

/**
 * Created by PokerFace on 2015/8/20.
 */
public class Result {

    @Expose
    private String province;
    @Expose
    private String city;
    @Expose
    private String areacode;
    @Expose
    private String zip;
    @Expose
    private String company;
    @Expose
    private String card;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
