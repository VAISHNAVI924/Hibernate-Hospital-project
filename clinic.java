package ward;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class clinic {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
private int  hospitleid;
private String hospitlename;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getHospitleid() {
	return hospitleid;
}
public void setHospitleid(int hospitleid) {
	this.hospitleid = hospitleid;
}
public String getHospitlename() {
	return hospitlename;
}
public void setHospitlename(String hospitlename) {
	this.hospitlename = hospitlename;
}

	
	
}
