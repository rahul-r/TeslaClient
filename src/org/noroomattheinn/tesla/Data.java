package org.noroomattheinn.tesla;


import java.util.ArrayList;

import us.monoid.json.JSONArray;
import us.monoid.json.JSONException;
import us.monoid.json.JSONObject;

public class Data extends ChargeState {
    public final Integer apiVersion;
    public final String backseatToken;
    public final String backseatTokenUpdatedAt;
    public final boolean calendarEnabled;
    public final String color;
    public final String displayName;
    public final String id;
    public final boolean inService;
    public final String optionCodes;
    public final String state;
    public final ArrayList<String> tokens;
    public final String userId;
    public final String vehicleId;
    public final String vin;

    public final ChargeState chargeState;
    public final DriveState driveState;
    public final GUIState guiState;
    public final HVACState hvacState;
    public final VehicleState vehicleState;
    public final  VehicleConfig vehicleConfig;

    public Data(JSONObject source) throws JSONException {
        super(source);

        apiVersion = source.optInt("api_version");
        backseatToken = source.optString("backseat_token");
        backseatTokenUpdatedAt = source.optString("backseat_token_updated_at");
        calendarEnabled = source.optBoolean("calendar_enabled");
        color = source.optString("color");
        displayName = source.optString("display_name");
        id = source.optString("id");
        inService = source.optBoolean("in_service");
        optionCodes = source.optString("option_codes");
        state = source.optString("state");
        JSONArray vals = source.getJSONArray("tokens");
        tokens = new ArrayList<>();
        if (vals != null) {
            int len = vals.length();
            for (int i=0; i<len; i++){
                tokens.add(vals.get(i).toString());
            }
        }
        userId = source.optString("user_id");
        vehicleId = source.optString("vehicle_id");
        vin = source.optString("vin");

        chargeState = new ChargeState(source.getJSONObject("charge_state"));
        driveState = new DriveState(source.getJSONObject("drive_state"));
        guiState = new GUIState(source.getJSONObject("gui_settings"));
        hvacState = new HVACState(source.getJSONObject("climate_state"));
        vehicleState = new VehicleState(source.getJSONObject("vehicle_state"));
        vehicleConfig = new VehicleConfig((source.getJSONObject("vehicle_config")));
    }
}
