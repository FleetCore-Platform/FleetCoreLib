package io.levysworks.Algorithms;

import io.levysworks.Mavlink.MissionFile;
import org.postgis.Geometry;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PolygonCoverageAlgorithm {
    // TODO: Implement algorithm for calculating polygon survey path
    public static File calculateSinge(Geometry polygon) throws IOException {
        return File.createTempFile("temp", "zip");
    }
}
