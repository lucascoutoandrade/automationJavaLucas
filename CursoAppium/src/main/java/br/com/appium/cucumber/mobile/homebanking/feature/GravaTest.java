package br.com.appium.cucumber.mobile.homebanking.feature;

import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_QUICKTIME;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_QUICKTIME_JPEG;
import static org.monte.media.VideoFormatKeys.QualityKey;
import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

public class GravaTest {

	public static ScreenRecorder screenRecorder;

	public void startRecorder() throws IOException, AWTException {
		// Create an instance of GraphicsConfiguration to get the Graphics configuration
		// of the Screen.
		// This is needed for ScreenRecorder class.
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice()
				.getDefaultConfiguration();

		// Create a instance of ScreenRecorder with the required configurations
		screenRecorder = new ScreenRecorder(gc, new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_QUICKTIME),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_QUICKTIME_JPEG, CompressorNameKey,
						ENCODING_QUICKTIME_JPEG, DepthKey, (int) 24, FrameRateKey, Rational.valueOf(15), QualityKey,
						1.0f, KeyFrameIntervalKey, (int) (15 * 60)),
				new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
				null);

		// Call the start method of ScreenRecorder to begin recording
		screenRecorder.start();

	}

	public void finishRecorder() throws IOException {
		screenRecorder.stop();
	}

}
