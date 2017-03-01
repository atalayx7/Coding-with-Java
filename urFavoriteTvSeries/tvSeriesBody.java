package urFavoriteTvSeries;

public class tvSeriesBody {

	private String showName;
	private int totalSeason, seenSeason;

	public tvSeriesBody(String ShowName) {
		showName = ShowName;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getTotalSeason() {
		return totalSeason;
	}

	public void setTotalSeason(int totalSeason) {
		this.totalSeason = totalSeason;
	}

	public int getSeenSeason() {
		return seenSeason;
	}

	public void setSeenSeason(int seenSeason) {
		this.seenSeason = seenSeason;
	}

}
