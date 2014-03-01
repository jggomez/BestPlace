package com.bestplacemobile.models;

import com.google.android.gms.maps.model.LatLng;

public class Place {

	private int type;
	private String title;
	private double[] location;
	private String description;

	public final static int TYPE_HOSTEL = 0;
	public final static int TYPE_STANDARD = 1;
	public final static int TYPE_LUXURY = 2;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getResourceMarker() {
		return com.bestplacemobile.R.drawable.marker_standard;
	}

	public double[] getLocation() {
		return location;
	}

	public LatLng getLatLng() {
		return new LatLng(location[0], location[1]);
	}

	public void setLocation(double[] location) {
		this.location = location;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "Tipo: " + type + "\nTitulo: " + title + "\nDescripción: "
				+ description + "\nUbicación: " + location[0] + ","
				+ location[1];
	}
}
