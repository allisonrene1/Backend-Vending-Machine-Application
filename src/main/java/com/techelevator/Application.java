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
		FileReader fileReader = new FileReader();
		Inventory inventory = new Inventory();
		CashBox cashBox = new CashBox();

		fileReader.restockVendingMachine();
		cashBox.setBalance(0.0);

		while(userInput != 3) {
			userInput = ui.showMainMenu();
			if(userInput == 1) {
				ui.outPutString(inventory.displayItemsForCustomer());
			} else if(userInput == 2) {
				while(purchaseInput != 3) {
					purchaseInput = ui.showPurchaseMenu(cashBox.getBalance());
					if(purchaseInput == 1) {
						ui.feedMoney(cashBox);
						//addlogging
					} else if(purchaseInput == 2) {
							ui.outPutString(inventory.displayItemsForCustomer());
							String itemCode = ui.askUserProduct();
							int quantity = ui.askUserQuantity();
							if (ui.isValidItem(itemCode) && ui.isValidQuantity(itemCode,quantity)) {
								ui.outPutString(inventory.dispenseItem(itemCode,quantity,cashBox));
								//addlogging
							} else if (!ui.isValidItem(itemCode)) {
								ui.outPutString("Product code doesn't exist");
							} else if (ui.isValidItem(itemCode) && !ui.isValidQuantity(itemCode,quantity)){
								ui.outPutString("Product is currently sold out, or there is not enough quantity left in the machine");
							}
					} else if(purchaseInput == 3) {
						ui.outPutString(cashBox.returnChange());
						purchaseInput = 0;
						break;
					}
				}
			}
		}
	}
}
