/**
 * jipCam : The Java IP Camera Project
 * Copyright (C) 2005-2006 Jason Thrasher
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.sf.jipcam.axis;

import java.util.EventObject;


/**
 * Represents the next image delivered from the video stream.
 *
 * @author Jason Thrasher
 */
public class MjpegParserEvent extends EventObject {
	private MjpegFrame mFrame;

	public MjpegParserEvent(Object source, MjpegFrame frame) {
		super(source);
		mFrame = frame;
	}

	public MjpegFrame getMjpegFrame() {
		return mFrame;
	}
}