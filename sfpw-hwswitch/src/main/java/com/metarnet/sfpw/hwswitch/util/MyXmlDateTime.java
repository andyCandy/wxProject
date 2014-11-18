package  com.metarnet.sfpw.hwswitch.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


public class MyXmlDateTime extends XMLGregorianCalendar {

	int _year;
	int _month;
	int _day;
	int _hour;
	int _minute;
	int _second;
	
	public MyXmlDateTime (
			int _year,
			int _month,
			int _day,
			int _hour,
			int _minute,
			int _second)
	{
		this._year=_year;
		this._month=_month;
		this._day=_day;
		this._hour=_hour;
		this._minute=_minute;
		this._second=_second;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setYear(BigInteger year) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setYear(int year) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setMonth(int month) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setDay(int day) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setTimezone(int offset) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setHour(int hour) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setMinute(int minute) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setSecond(int second) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setMillisecond(int millisecond) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setFractionalSecond(BigDecimal fractional) {
		// TODO Auto-generated method stub
	}

	@Override
	public BigInteger getEon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return this._year;
	}

	@Override
	public BigInteger getEonAndYear() {
		// TODO Auto-generated method stub
		return BigInteger.valueOf(this._year);
	}

	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return this._month;
	}

	@Override
	public int getDay() {
		// TODO Auto-generated method stub
		return this._day;
	}

	@Override
	public int getTimezone() {
		// TODO Auto-generated method stub
		return DatatypeConstants.FIELD_UNDEFINED;
	}

	@Override
	public int getHour() {
		// TODO Auto-generated method stub
		return this._hour;
	}

	@Override
	public int getMinute() {
		// TODO Auto-generated method stub
		return this._minute;
	}

	@Override
	public int getSecond() {
		// TODO Auto-generated method stub
		return this._second;
	}

	@Override
	public BigDecimal getFractionalSecond() {
		// TODO Auto-generated method stub		 
		return new BigDecimal(BigInteger.ZERO,0);
	}

	@Override
	public int compare(XMLGregorianCalendar xmlGregorianCalendar) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public XMLGregorianCalendar normalize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toXMLFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QName getXMLSchemaType() {
		// TODO Auto-generated method stub
		return javax.xml.datatype.DatatypeConstants.DATETIME;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(Duration duration) {
		// TODO Auto-generated method stub
	}

	@Override
	public GregorianCalendar toGregorianCalendar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GregorianCalendar toGregorianCalendar(TimeZone timezone,
			Locale aLocale, XMLGregorianCalendar defaults) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TimeZone getTimeZone(int defaultZoneoffset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return null;
	}

}
