package com.techelevator;

public class Application {

	public static void main(String[] args) {
		Application application = new Application();
		application.run();
	}

	public void run() {

		int userInput = 0;
		int purchaseInput = 0;


        UI ui = new UI();
		Inventory inventory = new Inventory();
		FileReader fileReader = new FileReader();
		CashBox cashBox = new CashBox();
		

		while(userInput != 3) {
			userInput = ui.showMainMenu();
			if(userInput == 1) {
				ui.outPutString(inventory.displayItemsForCustomer());
			} else if(userInput == 2) {
				while(purchaseInput != 3) {
					purchaseInput = ui.showPurchaseMenu(cashBox.getBalance());
					if(purchaseInput == 1) {
						ui.feedMoney();
					} else if(purchaseInput == 2) {
							String checkCode;
							int checkQuantity;
							checkCode = ui.askUserProduct();
							checkQuantity = ui.askUserQuantity();
					} else if(purchaseInput == 3) {

					}
				}

			}
		}


	}
}
