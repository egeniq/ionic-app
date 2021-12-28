package app.eduroam.geteduroam;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.emergya.wifieapconfigurator.WifiEapConfigurator;
import com.emergya.wifieapconfigurator.config.IntentConfigurator;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.Plugin;
import java.util.ArrayList;
import com.byteowls.capacitor.oauth2.OAuth2ClientPlugin;

public class MainActivity extends BridgeActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // Initializes the Bridge
    this.init(savedInstanceState, new ArrayList<Class<? extends Plugin>>() {{
      // Additional plugins you've installed go here
      // Ex: add(TotallyAwesomePlugin.class);
      add(WifiEapConfigurator.class);
      add(OAuth2ClientPlugin.class);
    }});
    // ATTENTION: This was auto-generated to handle app links.
    Intent appLinkIntent = getIntent();
    String appLinkAction = appLinkIntent.getAction();
    Uri appLinkData = appLinkIntent.getData();
  }

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
			if (requestCode == IntentConfigurator.ADD_NETWORKS_REQUEST_CODE) {
				// TODO handle result
			}
		}
	}
}
