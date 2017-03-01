package urFavoriteTvSeries;

import java.util.Scanner;

public class tvSeriesMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		tvSeriesBody[] x = new tvSeriesBody[3];

		for (int i = 0; i < x.length; i++) {
			System.out.print(i + 1 + ". your favorite Tv series : ");
			x[i] = new tvSeriesBody(scan.nextLine());

		}
		for (int j = 0; j < x.length; j++) {
			System.out.print("\nWhat is the total season of " + x[j].getShowName() + " : ");
			x[j].setTotalSeason(scan.nextInt());
		}
		for (int k = 0; k < x.length; k++) {
			System.out.print("\nHow many season have you watched : ");

			x[k].setSeenSeason(scan.nextInt());
		}
		System.out.println("\nSeries \t TotalSession \t WatchedSession");
		for (int m = 0; m < x.length; m++) {

			System.out.print(x[m].getShowName());
			System.out.print("\t\t" + x[m].getTotalSeason());
			System.out.print("\t\t" + x[m].getSeenSeason());
			System.out.println("");
		}

	}

}
