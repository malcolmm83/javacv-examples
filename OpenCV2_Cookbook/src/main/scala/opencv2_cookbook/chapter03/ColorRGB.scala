/*
 * Copyright (c) 2011-2015 Jarek Sacha. All Rights Reserved.
 *
 * Author's e-mail: jpsacha at gmail.com
 */

package opencv2_cookbook.chapter03

import java.awt.Color

object ColorRGB {
  /** Factory meethod for creating a color from a 3 byte array. */
  def fromBGR(b: Array[Byte]): ColorRGB = {
    require(b.length == 3)
    ColorRGB(b(2) & 0xFF, b(1) & 0xFF, b(0) & 0xFF)
  }
}

/**
 * Represents a color in RGB color space. Component values are expected to be in range [0-255]
 */
case class ColorRGB(red: Int, green: Int, blue: Int) {

  def this(color: Color) = this(color.getRed, color.getGreen, color.getBlue)

  def toColor = new Color(red, green, blue)
}