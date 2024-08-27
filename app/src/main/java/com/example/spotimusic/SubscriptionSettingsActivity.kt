package com.example.spotimusic

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.ViewFlipper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class SubscriptionSettingsActivity : AppCompatActivity() {

    lateinit var subscriptionStatusTextView: TextView
    lateinit var subscribeButtonBasic: Button
    lateinit var subscribeButtonStandard: Button
    lateinit var subscribeButtonPremium: Button
    lateinit var cancelButton: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_subscription_settings)



                subscriptionStatusTextView = findViewById(R.id.subscription_status_text_view)
                subscribeButtonBasic = findViewById(R.id.subscribe_button_basic)
                subscribeButtonStandard = findViewById(R.id.subscribe_button_standard)
                subscribeButtonPremium = findViewById(R.id.subscribe_button_premium)
                cancelButton = findViewById(R.id.cancel_button)

                subscribeButtonBasic.setOnClickListener {
                    subscribe("Basic Plan")
                }

                subscribeButtonStandard.setOnClickListener {
                    subscribe("Standard Plan")
                }

                subscribeButtonPremium.setOnClickListener {
                    subscribe("Premium Plan")
                }

                cancelButton.setOnClickListener {
                    cancelSubscription()
                }

                updateUI(false, "")
            }

            private fun subscribe(plan: String) {
                updateUI(true, plan)
            }

            private fun cancelSubscription() {
                updateUI(false, "")
            }

            private fun updateUI(isSubscribed: Boolean, plan: String) {
                if (isSubscribed) {
                    subscriptionStatusTextView.text = getString(R.string.subscribed_with_plan, plan)
                    subscribeButtonBasic.visibility = android.view.View.GONE
                    subscribeButtonStandard.visibility = android.view.View.GONE
                    subscribeButtonPremium.visibility = android.view.View.GONE
                    cancelButton.visibility = android.view.View.VISIBLE
                } else {
                    subscriptionStatusTextView.text = getString(R.string.not_subscribed)
                    subscribeButtonBasic.visibility = android.view.View.VISIBLE
                    subscribeButtonStandard.visibility = android.view.View.VISIBLE
                    subscribeButtonPremium.visibility = android.view.View.VISIBLE
                    cancelButton.visibility = android.view.View.GONE
                }
            }
        }