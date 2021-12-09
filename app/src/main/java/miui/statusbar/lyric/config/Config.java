package miui.statusbar.lyric.config;

import static miui.statusbar.lyric.utils.Utils.PATH;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;

import de.robv.android.xposed.XSharedPreferences;
import miui.statusbar.lyric.utils.ConfigUtils;

@SuppressLint("LongLogTag")
public class Config {
    ConfigUtils config;

    public Config(XSharedPreferences xSharedPreferences) {
        config = new ConfigUtils(xSharedPreferences);
    }

    public Config(SharedPreferences sharedPreferences) {
        config = new ConfigUtils(sharedPreferences);
    }

    public void update() {
        config.update();
    }

    public Boolean getLyricService() {
        return config.optBoolean("LyricService", false);
    }

    public void setLyricService(Boolean bool) {
        config.put("LyricService", bool);
    }

    public int getLyricWidth() {
        return config.optInt("LyricWidth", -1);
    }

    public void setLyricWidth(int i) {
        config.put("LyricWidth", i);
    }

    public int getLyricMaxWidth() {
        return config.optInt("LyricMaxWidth", -1);
    }

    public void setLyricMaxWidth(int i) {
        config.put("LyricMaxWidth", i);
    }

    public int getLyricPosition() {
        return config.optInt("LyricPosition", 2);
    }

    public void setLyricPosition(int i) {
        config.put("LyricPosition", i);
    }

    public Boolean getLyricAutoOff() {
        return config.optBoolean("LyricAutoOff", true);
    }

    public void setLyricAutoOff(Boolean bool) {
        config.put("LyricAutoOff", bool);
    }

    public Boolean getLockScreenOff() {
        return config.optBoolean("lockScreenOff", false);
    }

    public void setLockScreenOff(Boolean bool) {
        config.put("lockScreenOff", bool);
    }

    public void sethNoticeIcon(Boolean bool) {
        config.put("hNoticeIcon", bool);
    }

    public String getLyricColor() {
        return config.optString("LyricColor", "off");
    }

    public void setLyricColor(String str) {
        config.put("LyricColor", str);
    }

    public Boolean getLyricSwitch() {
        return config.optBoolean("LyricSwitch", false);
    }

    public void setLyricSwitch(Boolean bool) {
        config.put("LyricSwitch", bool);
    }

    public Boolean getHNoticeIco() {
        return config.optBoolean("hNoticeIcon", false);
    }

    public Boolean getHNetSpeed() {
        return config.optBoolean("hNetSpeed", false);
    }

    public void setHNetSpeed(Boolean bool) {
        config.put("hNetSpeed", bool);
    }

    public Boolean getHCUK() {
        return config.optBoolean("hCUK", false);
    }

    public void setHCUK(Boolean bool) {
        config.put("hCUK", bool);
    }

    public Boolean getDebug() {
        try {
            return config.optBoolean("debug", false);
        } catch (NullPointerException ignored) {
            return false;
        }
    }

    public void setDebug(Boolean bool) {
        config.put("debug", bool);
    }

    public boolean getIcon() {
        return config.optBoolean("Icon", true);
    }

    public void setIcon(Boolean bool) {
        config.put("Icon", bool);
    }

    public Float getLyricSpeed() {
        return config.optFloat("LyricSpeed", 1f);
    }

    public void setLyricSpeed(Float f) {
        config.put("LyricSpeed", f);
    }

    public Boolean getIconAutoColor() {
        return config.optBoolean("IconAutoColor", true);
    }

    public void setIconAutoColor(Boolean bool) {
        config.put("IconAutoColor", bool);
    }

    public String getIconPath() {
        return config.optString("IconPath", PATH);
    }

    public void setIconPath(String str) {
        config.put("IconPath", str);
    }

    public boolean getAntiBurn() {
        return config.optBoolean("antiburn", false);
    }

    public void setAntiBurn(Boolean bool) {
        config.put("antiburn", bool);
    }

    public String getAnim() {
        return config.optString("Anim", "off");
    }

    public void setAnim(String str) {
        config.put("Anim", str);
    }

    public String getHook() {
        return config.optString("Hook", "");
    }

    public void setHook(String str) {
        config.put("Hook", str);
    }

    public boolean getFileLyric() {
        return config.optBoolean("FileLyric", false);
    }

    public void setFileLyric(boolean bool) {
        config.put("FileLyric", bool);
    }

    public boolean getLyricStyle() {
        return config.optBoolean("LyricStyle", true);
    }

    public void setLyricStyle(boolean bool) {
        config.put("LyricStyle", bool);
    }

    public boolean getLShowOnce() {
        return config.optBoolean("LShowOnce", false);
    }

    public void setLShowOnce(boolean bool) {
        config.put("LShowOnce", bool);
    }

    public void clear() {
        config.clearConfig();
    }
}