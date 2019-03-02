package com.atherys.rpg;

import com.atherys.rpg.facade.RPGCharacterFacade;
import com.atherys.rpg.facade.RPGMessagingFacade;
import com.atherys.rpg.listener.EntityListener;
import com.atherys.rpg.listener.SkillsListener;
import com.atherys.rpg.repository.PlayerCharacterRepository;
import com.atherys.rpg.service.AttributeService;
import com.atherys.rpg.service.DamageService;
import com.atherys.rpg.service.ExpressionService;
import com.atherys.rpg.service.RPGCharacterService;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class AtherysRPGModule extends AbstractModule {
    @Override
    protected void configure() {
        // Config
        bind(AtherysRPGConfig.class).in(Scopes.SINGLETON);

        // Repository
        bind(PlayerCharacterRepository.class).in(Scopes.SINGLETON);

        // Services
        bind(ExpressionService.class).in(Scopes.SINGLETON);
        bind(AttributeService.class).in(Scopes.SINGLETON);
        bind(DamageService.class).in(Scopes.SINGLETON);
        bind(RPGCharacterService.class).in(Scopes.SINGLETON);

        // Facades
        bind(RPGMessagingFacade.class).in(Scopes.SINGLETON);
        bind(RPGCharacterFacade.class).in(Scopes.SINGLETON);

        // Listeners
        bind(EntityListener.class).in(Scopes.SINGLETON);
        bind(SkillsListener.class).in(Scopes.SINGLETON);
    }
}
