package kioskManager;

import lombok.Data;

@Data
public class Asset {

	int income=0, outcome=0, totalAsset=0;
	
	void income(int money) {
		this.income+=money;
		totalAsset();
	}
	void outcome(int money) {
		this.outcome-=money;
		totalAsset();
	}
	void totalAsset() {
		totalAsset=income+outcome;
	}
}
