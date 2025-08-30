package io.levysworks.Mavlink;

import com.google.gson.Gson;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MissionFile {
    public final String fileType = "Plan";
    public String groundStation;
    public Mission mission;
    public final int version = 1;

    public MissionFile(Mission mission, String groundStation) {
        this.mission = mission;
        this.groundStation = groundStation;
    }

    public InputStream toStream() {
        String json = new Gson().toJson(this);
        return new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
    }

    public static class Mission {
        public int cruiseSpeed;
        public final int firmwareType = 12;
        public final int globalPlanAltitudeMode = 1;
        public int hoverSpeed;
        public Item[] items;
        public double[] plannedHomePosition;
        public final int vehicleType = 2;
        public final int version = 2;

        public Mission(int cruiseSpeed, int hoverSpeed, Item[] items, double[] plannedHomePosition) {
            this.cruiseSpeed = cruiseSpeed;
            this.hoverSpeed = hoverSpeed;
            this.items = items;
            this.plannedHomePosition = plannedHomePosition;
        }
    }

    public static class Item {
        public Double AMSLAltAboveTerrain = null;
        public int Altitude;
        public int AltitudeMode;
        public boolean autoContinue = true;
        public int command;
        public Integer doJumpId = null;
        public int frame;
        public Double[] params;
        public final String type = "SimpleItem";

        public Item(Double AMSLAltAboveTerrain, int altitude, int altitudeMode, boolean autoContinue, int command, Integer doJumpId, int frame, Double[] params) {
            this.AMSLAltAboveTerrain = AMSLAltAboveTerrain;
            this.Altitude = altitude;
            this.AltitudeMode = altitudeMode;
            this.autoContinue = autoContinue;
            this.command = command;
            this.doJumpId = doJumpId;
            this.frame = frame;
            this.params = params;
        }
    }
}
