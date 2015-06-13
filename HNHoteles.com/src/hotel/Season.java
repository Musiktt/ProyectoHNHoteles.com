/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

/**
 *
 * @author Stward
 */
public class Season{
    private String name;
    private String code;
    private String startDate;
    private String endDate;
     
    
    public Season() {
    }

    public Season(String name, String code, String startDate, String endDate) {
        this.name = name; 
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
        
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Season{" + "code=" + code + ", startDate=" + startDate + ", endDate=" + endDate + ", name=" + name + '}';
    }

    
    
    
}
