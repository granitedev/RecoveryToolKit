// Generated code from Butter Knife. Do not modify!
package com.granitemountainbhc.recoverytoolkit;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TitleFragment_ViewBinding implements Unbinder {
  private TitleFragment target;

  @UiThread
  public TitleFragment_ViewBinding(TitleFragment target, View source) {
    this.target = target;

    target.mainContent = Utils.findRequiredViewAsType(source, R.id.main_content, "field 'mainContent'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TitleFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mainContent = null;
  }
}
