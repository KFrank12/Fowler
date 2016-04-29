/**
 * 
 * Created by Kassandra Frank on 29.04.2016
 *
 */

public class NewReleasePrice extends Price {
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	double getCharge(int daysRented) {
		return daysRented * 3;
	}
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2: 1;
	}
}
