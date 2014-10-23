/* 
 * Copyright (C) 2014 David "PhaseBurn" Bauman
 * Copyright (C) 2014 CarbonROM
 * Copyright (c) 2014 Team OctOS
 * 
 * Based on Chainfire's OpenDelta for Omni Rom, and work by Myself5
 */
/* 
 * This file is part of OctDelta.
 * 
 * OctDelta is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * OctDelta is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with OctDelta. If not, see <http://www.gnu.org/licenses/>.
 */

package com.oct.delta;

public class Native {
    public static native int zipadjust(String filenameIn, String filenameOut, int decompress);

    public static native int dedelta(String filenameSource, String filenameDelta, String filenameOut);

    static {
        System.loadLibrary("octdelta");
    }
}
