package ytb_java3.abstractclass.and.interfaces;

import ytb_java3.accessmodifiers.Test;

public class OutsideErisim extends Test{

	public static void main(String[] args) {

		OutsideErisim outsideErisimObjesi = new OutsideErisim();
		
		System.out.println("Eristigim degiskenler : " + 
				outsideErisimObjesi.korumali + outsideErisimObjesi.herkese);

	}

}
