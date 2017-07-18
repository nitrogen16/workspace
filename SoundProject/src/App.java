import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;


public class App {

	public static void main(String[] args) throws InvalidMidiDataException {
			
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
		
		}
	}
	


