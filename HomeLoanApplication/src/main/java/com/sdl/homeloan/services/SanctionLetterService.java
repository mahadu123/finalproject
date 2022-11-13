package com.sdl.homeloan.services;

import com.sdl.homeloan.models.SanctionLetter;

public interface SanctionLetterService {

	void createSanctionLetter(SanctionLetter sl);

	SanctionLetter getSanctionletter(int slid);

}
