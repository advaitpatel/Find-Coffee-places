package slidenerd.vivz.gpdemo.model;
/**
 * Created by Advait on 02/05/17.
 */
import com.google.gson.annotations.SerializedName;

public class Geometry {
    @SerializedName("location")
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Location [location = " + location + "]";
    }
}
