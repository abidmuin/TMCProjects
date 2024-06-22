import java.util.HashMap;

public class IOU {
	private final HashMap<String, Double> iou;

	public IOU() {
		this.iou = new HashMap<>();
	}

	public double howMuchDoIOweTo(String toWhom) {
		if (iou.containsKey(toWhom)) {
			return iou.get(toWhom);
		}

		return 0;
	}

	public void setSum(String toWhom, double amount) {
		iou.put(toWhom, amount);
	}
}
