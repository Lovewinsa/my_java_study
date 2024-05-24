package test.mypac;

public class MacBook {
	// 외부에서 접근 불가하도록 접근지정자를 private로 해서 field 3개 선언하기
		// MacBook class이외에는 접근 불가능
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
}
