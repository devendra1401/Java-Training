
public class InstrumentTest {

	public static void main(String[] args) {
//		Guitar guitar = new Guitar();
//		guitar.use();
//		guitar.tuneStrings();
//		guitar.play();
//		guitar.pluck();
//		
//		Violin violin = new Violin();
//		violin.use();
//		violin.tuneStrings();
//		violin.play();
//		violin.bow();
		
		Instrument sbmi = new Violin();
		sbmi.use();
		((Violin) sbmi).play();
		((Violin) sbmi).tuneStrings();
		((Violin) sbmi).bow();
	}
}

interface Instrument{
	void use();
}

abstract class MusicalInstrument implements Instrument{
	abstract void play();
}

abstract class StringBaseMusicalInstrument extends MusicalInstrument{
	abstract void tuneStrings();
}

class Guitar extends StringBaseMusicalInstrument{
	
	public void use() {
		System.out.println("Using Guitar...");
	}
	
	void play() {
		System.out.println("Playing Guitar...");
	}
	
	void tuneStrings() {
		System.out.println("Tuning String of Violin...");
	}
	
	void pluck() {
		System.out.println("Plucking string of Guitar...");
	}
}

class Violin extends StringBaseMusicalInstrument{
	public void use() {
		System.out.println("Using Violin...");
	}
	
	void play(){
		System.out.println("Playing Violin...");
	}
	
	void tuneStrings() {
		System.out.println("Tuning String of Violin...");
	}
	
	void bow() {
		System.out.println("Bowing String of Violin...");
	}
}

abstract class AirBaseMusicalInstrument extends MusicalInstrument{
	abstract void bowAir();
}

class Flute extends AirBaseMusicalInstrument{
	public void use() {
		System.out.println("Using Flute...");
	}
	
	void play(){
		System.out.println("Playing Flute...");
	}
	
	void bowAir(){
		System.out.println("Bowing Air in the Flute...");
	}
	
	void holdHole() {
		System.out.println("Holing the holes of Flute...");
	}
}

class Harmonium extends AirBaseMusicalInstrument{
	public void use() {
		System.out.println("Using Harmonium...");
	}
	
	void play(){
		System.out.println("Playing Harmonium...");
	}
	
	void bowAir(){
		System.out.println("Bowing Air in the Harmonium...");
	}
	
	void playByFinger() {
		System.out.println("Playing Harmonium by Fingers...");
	}
}

abstract class DrumBaseMusicalInstrument extends MusicalInstrument{
	abstract void tuneSurface();
}

class Tabla extends DrumBaseMusicalInstrument{
	public void use() {
		System.out.println("Using Table...");
	}
	
	void play(){
		System.out.println("Playing Table...");
	}
	
	void tuneSurface(){
		System.out.println("Tuning through the Surface of Tabla...");
	}
	
	void beat(){
		System.out.println("Beating on the Surface of Tabla...");
	}
}

class Dhol extends DrumBaseMusicalInstrument{
	public void use() {
		System.out.println("Using Dhol...");
	}
	
	void play(){
		System.out.println("Playing Dhol...");
	}
	
	void tuneSurface(){
		System.out.println("Tuning through the Surface of Dhol...");
	}
	
	void stick(){
		System.out.println("Sticking on the Surface of Dhol...");
	}
}

abstract class MedicalInstrument implements Instrument{
	abstract void operate();
}

abstract class SurgicalInstruments extends MedicalInstrument{
	abstract void sterile();
}

class SurgicalCutter extends SurgicalInstruments{
	public void use() {
		System.out.println("Using Surgical Cutter...");
	}
	
	void operate() {
		System.out.println("Operating Surgical Cutter...");
	}
	
	void sterile() {
		System.out.println("Sterilizing through Surgical Cutter...");
	}
	
	void cut() {
		System.out.println("Cutting the tissues at the surface...");
	}
}

class SurgicalNeedle extends SurgicalInstruments{
	public void use() {
		System.out.println("Using Surgical Needle...");
	}
	
	void operate() {
		System.out.println("Operating Surgical Needle...");
	}
	
	void sterile() {
		System.out.println("Sterilizing through Surgical Needle...");
	}
	
	void suture() {
		System.out.println("Suturing tissues using Surgical Needle...");
	}
}

abstract class PathologicalInstruments extends MedicalInstrument{
	abstract void reader();
}

class Glucometer extends PathologicalInstruments{
	public void use() {
		System.out.println("Using Glucometer...");
	}
	
	void operate() {
		System.out.println("Operating Glucometer...");
	}
	
	void reader() {
		System.out.println("Glucometer is reading...");
	}
	
	void monitor() {
		System.out.println("Monitoring blood sugar level...");
	}
}

class EcgMachine extends PathologicalInstruments{
	public void use() {
		System.out.println("Using ECG Machine...");
	}
	
	void operate() {
		System.out.println("Operating ECG Machine...");
	}
	
	void reader() {
		System.out.println("ECG Machine is reading...");
	}
	
	void show() {
		System.out.println("ECG machine is showing the functioning of Heart...");
	}
}