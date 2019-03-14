package org.noroomattheinn.tesla;

import us.monoid.json.JSONObject;

public class VehicleConfig {
    public final Boolean canAcceptNavigationRequests;
    public final Boolean canActuateTrunks;
    public final String carSpecialType;
    public final String carType;
    public final String chargePortType;
    public final Boolean euVehicle;
    public final String exteriorColor;
    public final Boolean hasAirSuspension;
    public final Boolean hasLudicrous_mode;
    public final Integer keyVersion;
    public final Boolean motorizedChargePort;
    public final String perfConfig;
    public final String plg;
    public final Integer rearSeat_heaters;
    public final String rearSeatType;
    public final Boolean rhd;
    public final String roofColor;
    public final String seatType;
    public final String spoilerType;
    public final Boolean sunRoofInstalled;
    public final String thirdRowSeats;
    public final Integer timestamp;
    public final String wheelType;

    public VehicleConfig(JSONObject source) {
        canAcceptNavigationRequests = source.optBoolean("can_accept_navigation_requests");
        canActuateTrunks = source.optBoolean("can_actuate_trunks");
        carSpecialType = source.optString("car_special_type");
        carType = source.optString("car_type");
        chargePortType = source.optString("charge_port_type");
        euVehicle = source.optBoolean("eu_vehicle");
        exteriorColor = source.optString("exterior_color");
        hasAirSuspension = source.optBoolean("has_air_suspension");
        hasLudicrous_mode = source.optBoolean("has_ludicrous_mode");
        keyVersion = source.optInt("key_version");
        motorizedChargePort = source.optBoolean("motorized_charge_port");
        perfConfig = source.optString("perf_config");
        plg = source.optString("plg");
        rearSeat_heaters = source.optInt("rear_seat_heaters");
        rearSeatType = source.optString("rear_seat_type");
        rhd = source.optBoolean("rhd");
        roofColor = source.optString("roof_color");
        seatType = source.optString("seat_type");
        spoilerType = source.optString("spoiler_type");
        sunRoofInstalled = source.optBoolean("sun_roof_installed");
        thirdRowSeats = source.optString("third_row_seats");
        timestamp = source.optInt("timestamp");
        wheelType = source.optString("wheel_type");
    }
}
