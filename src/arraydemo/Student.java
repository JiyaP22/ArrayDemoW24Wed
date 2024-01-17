
package arraydemo;

/**
 *Commenting for modification on jan 17 at 9:48 AM
 * @author jiyap
 */
public class Student {
    private int sId;
    private String sname;

    public Student(int sId, String sname) {
        this.sId = sId;
        this.sname = sname;
    }
    
    

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
    
}
