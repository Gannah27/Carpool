// Generated by view binder compiler. Do not edit!
package com.example.driverapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.driverapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OfferrideuHBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button12;

  @NonNull
  public final Button button13;

  @NonNull
  public final EditText editText10;

  @NonNull
  public final EditText editText12;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Spinner spinner01;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView17;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  private OfferrideuHBinding(@NonNull ConstraintLayout rootView, @NonNull Button button12,
      @NonNull Button button13, @NonNull EditText editText10, @NonNull EditText editText12,
      @NonNull ImageView imageView, @NonNull Spinner spinner01, @NonNull TextView textView15,
      @NonNull TextView textView17, @NonNull TextView textView18, @NonNull TextView textView19,
      @NonNull TextView textView20) {
    this.rootView = rootView;
    this.button12 = button12;
    this.button13 = button13;
    this.editText10 = editText10;
    this.editText12 = editText12;
    this.imageView = imageView;
    this.spinner01 = spinner01;
    this.textView15 = textView15;
    this.textView17 = textView17;
    this.textView18 = textView18;
    this.textView19 = textView19;
    this.textView20 = textView20;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OfferrideuHBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OfferrideuHBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.offerrideu_h, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OfferrideuHBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button12;
      Button button12 = ViewBindings.findChildViewById(rootView, id);
      if (button12 == null) {
        break missingId;
      }

      id = R.id.button13;
      Button button13 = ViewBindings.findChildViewById(rootView, id);
      if (button13 == null) {
        break missingId;
      }

      id = R.id.editText10;
      EditText editText10 = ViewBindings.findChildViewById(rootView, id);
      if (editText10 == null) {
        break missingId;
      }

      id = R.id.editText12;
      EditText editText12 = ViewBindings.findChildViewById(rootView, id);
      if (editText12 == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.spinner01;
      Spinner spinner01 = ViewBindings.findChildViewById(rootView, id);
      if (spinner01 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView17;
      TextView textView17 = ViewBindings.findChildViewById(rootView, id);
      if (textView17 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      return new OfferrideuHBinding((ConstraintLayout) rootView, button12, button13, editText10,
          editText12, imageView, spinner01, textView15, textView17, textView18, textView19,
          textView20);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
