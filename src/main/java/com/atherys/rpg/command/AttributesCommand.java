package com.atherys.rpg.command;

import com.atherys.core.command.PlayerCommand;
import com.atherys.core.command.annotation.Aliases;
import com.atherys.core.command.annotation.Children;
import com.atherys.rpg.AtherysRPG;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.entity.living.player.Player;

import javax.annotation.Nonnull;

@Aliases({"attributes", "attribs", "stats"})
@Children({
        AddAttributeCommand.class,
        RemoveAttributeCommand.class,
        AddAttributeToItemCommand.class
})
public class AttributesCommand implements PlayerCommand {
    @Nonnull
    @Override
    public CommandResult execute(@Nonnull Player source, @Nonnull CommandContext args) throws CommandException {
        AtherysRPG.getInstance().getAttributeFacade().showPlayerAttributes(source);
        return CommandResult.success();
    }
}
