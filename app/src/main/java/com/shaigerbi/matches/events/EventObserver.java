package com.shaigerbi.matches.events;

import com.shaigerbi.matches.events.engine.FlipDownCardsEvent;
import com.shaigerbi.matches.events.engine.GameWonEvent;
import com.shaigerbi.matches.events.engine.HidePairCardsEvent;
import com.shaigerbi.matches.events.ui.BackGameEvent;
import com.shaigerbi.matches.events.ui.DifficultySelectedEvent;
import com.shaigerbi.matches.events.ui.FlipCardEvent;
import com.shaigerbi.matches.events.ui.NextGameEvent;
import com.shaigerbi.matches.events.ui.ResetBackgroundEvent;
import com.shaigerbi.matches.events.ui.StartEvent;
import com.shaigerbi.matches.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
