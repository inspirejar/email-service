package com.membaza.api.email.email.model;

import com.membaza.api.email.email.Model;
import com.membaza.api.email.email.ModelType;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * {@link Model} representing a large, clickable button.
 *
 * @author Emil Forslund
 * @since  1.0.0
 */
@Data @AllArgsConstructor
public final class Button implements Model {

    private String value;
    private String href;

    @Override
    public ModelType getType() {
        return ModelType.BUTTON;
    }
}
