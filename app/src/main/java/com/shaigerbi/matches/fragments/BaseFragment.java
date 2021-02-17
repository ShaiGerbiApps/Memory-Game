package com.shaigerbi.matches.fragments;

import android.support.v4.app.Fragment;

import com.shaigerbi.matches.events.EventObserver;
import com.shaigerbi.matches.events.engine.FlipDownCardsEvent;
import com.shaigerbi.matches.events.engine.GameWonEvent;
import com.shaigerbi.matches.events.engine.HidePairCardsEvent;
import com.shaigerbi.matches.events.ui.BackGameEvent;
import com.shaigerbi.matches.events.ui.FlipCardEvent;
import com.shaigerbi.matches.events.ui.NextGameEvent;
import com.shaigerbi.matches.events.ui.ResetBackgroundEvent;
import com.shaigerbi.matches.events.ui.ThemeSelectedEvent;
import com.shaigerbi.matches.events.ui.DifficultySelectedEvent;
import com.shaigerbi.matches.events.ui.StartEvent;

public class BaseFragment extends Fragment implements EventObserver {

	@Override
	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();
	}

}
