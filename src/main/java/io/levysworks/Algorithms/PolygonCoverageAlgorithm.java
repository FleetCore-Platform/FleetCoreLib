package io.levysworks.Algorithms;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import org.postgis.Geometry;

public class PolygonCoverageAlgorithm {
    // TODO: Implement algorithm for calculating polygon survey path
    public static File calculateSinge(Geometry polygon) throws IOException {
        return File.createTempFile("temp", "zip");
    }
}
