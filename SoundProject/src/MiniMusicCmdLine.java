import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;


public class MiniMusicCmdLine{

	public void play(int instrument, int note) {
		// TODO Auto-generated method stub
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			
			MidiEvent event = null;
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 20, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(144, 1, 20, 100);
			MidiEvent noteOff = new MidiEvent(b, 3);
			track.add(noteOff);
			
			player.setSequence(seq);
			player.start();
			
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}

}