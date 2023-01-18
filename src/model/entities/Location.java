package model.entities;

import java.time.LocalDateTime;

public class Location {
	
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private ModelVehicle vehicle;
	private Invoice invoice;
	
	public Location() {
	}

	public Location(LocalDateTime start, LocalDateTime finish, ModelVehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public ModelVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(ModelVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
