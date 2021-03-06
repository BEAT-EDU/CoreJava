package corejava07_04.inheritAndPoly.interfaces;

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
} /*
 * Output: Using Processor LowPass Waveform 0 Using Processor HighPass Waveform
 * 0 Using Processor BandPass Waveform 0
 */// :~