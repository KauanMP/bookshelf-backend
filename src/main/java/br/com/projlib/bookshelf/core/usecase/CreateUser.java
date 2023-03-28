package br.com.projlib.bookshelf.core.usecase;

import br.com.projlib.bookshelf.core.domain.UserAccount;
import br.com.projlib.bookshelf.core.gateway.UserAccountGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUser {
    private UserAccountGateway userAccountGateway;

    public UserAccount process(UserAccount userAccount) {
        return userAccountGateway.create(userAccount);
    }
}
