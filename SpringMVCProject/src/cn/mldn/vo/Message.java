package cn.mldn.vo;

import java.io.Serializable;
import java.sql.Date;
@SuppressWarnings("sserial")
public class Message implements Serializable {
	private Integer mid;
	private String title;
	private Double price;
	private Date  pubDate;
	private Type type;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Message [mid=" + mid + ", title=" + title + ", price=" + price + ", pubDate=" + pubDate + ", type="
				+ type + "]";
	}
	
}
