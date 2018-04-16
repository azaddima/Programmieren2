package calculator;

public class CalcController {
	
	public CalcController(CalcView view, CalcModel model) {

		view.getBtn0().addActionListener(l -> {
			model.addChar('0');
		});
		view.getBtn1().addActionListener(l -> {
			model.addChar('1');
		});
		view.getBtn2().addActionListener(l -> {
			model.addChar('2');
		});
		view.getBtn3().addActionListener(l -> {
			model.addChar('3');
		});
		view.getBtn4().addActionListener(l -> {
			model.addChar('4');
		});
		view.getBtn5().addActionListener(l -> {
			model.addChar('5');
		});
		view.getBtn6().addActionListener(l -> {
			model.addChar('6');
		});
		view.getBtn7().addActionListener(l -> {
			model.addChar('7');
		});
		view.getBtn8().addActionListener(l -> {
			model.addChar('8');
		});
		view.getBtn9().addActionListener(l -> {
			model.addChar('9');
		});
		view.getBtnPoint().addActionListener(l -> {
			model.addChar('.');
		});
		view.getBtnPlus().addActionListener(l -> {
			model.addition();
		});
		view.getBtnMinus().addActionListener(l -> {
			model.minus();
		});
		view.getBtnProd().addActionListener(l -> {
			model.prod();
		});
		view.getBtnDiv().addActionListener(l -> {
			model.div();
		});
		view.getBtnEquals().addActionListener(l -> {
			model.calculate();
		});
		
		model.addObserver(view);
	}
	
	
	
	public static void main(String[] args) {
		new CalcController(new CalcView(), new CalcModel());
		
	}

}
