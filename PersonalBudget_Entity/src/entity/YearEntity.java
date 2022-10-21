package entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mipresupuesto.personalbudget.crosscutting.Itils.UtilUUID;


@Entity
@Table (name = "Year")
public final class YearEntity {
	
	@Id
	@Column(name = "id")
	private UUID id;
	@Column(name = "year")
	private int year;
	
	public YearEntity(){ 
		setId (UtilUUID.DEFAULT_UUID);
		setYear(0);
	}
	
	public YearEntity(final UUID id, final int year) {
		setId(id);
		setYear(year);
	}
	
	public static final YearEntity create() {
		return new YearEntity();
	}
	public final UUID getId() {
		return id;
	}
	public final void setId(final UUID id) {
		this.id = id;
	}
	public final int getYear() {
		return year;
	}
	public final void setYear(final int year) {
		this.year = year;
	}

}
