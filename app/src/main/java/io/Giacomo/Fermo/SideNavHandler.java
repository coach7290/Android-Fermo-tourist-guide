package io.Giacomo.Fermo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import java.io.Serializable ;

/**
 * Fragment bar class details and actions
 *
 * @author Giacomo Cochetti
 */
public class SideNavHandler implements NavigationView.OnNavigationItemSelectedListener {

    Activity activity;
    DrawerLayout drawer;

    public SideNavHandler(Activity activity) {
        this.activity = activity;
        drawer = activity.findViewById(R.id.drawer_layout);
    }

    /**
     * navigate to external urls when menu items are tapped
     * @param item that was tapped
     * @return
     */
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        String url = "";

        switch (item.getItemId()){
            case R.id.History:
                url = activity.getString(R.string.Fermo_History_url);
                break;

            case R.id.Bus:
                url = activity.getString(R.string.HowToGetThereBus_url);
                break;

            case R.id.Train:
                url = activity.getString(R.string.HowToGetThereBus_url);
                break;

            case R.id.Sunbathe:
                url = activity.getString(R.string.PSG_url);
                break;
        }

        // link handling
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        if (browserIntent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(browserIntent);
        }

        closeDrawer();


        return false;
    }

    /**
     * Close the drawer if it's currently open
     */
    public void closeDrawer() {
        if (isDrawerOpen()) {
            drawer.closeDrawer(GravityCompat.START);
        }
    }

    /**
     * @return true of the drawer is currently open
     */
    public boolean isDrawerOpen() {
        return drawer.isDrawerOpen(GravityCompat.START);
    }
}
