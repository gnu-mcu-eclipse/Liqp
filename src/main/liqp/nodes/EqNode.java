package liqp.nodes;

import liqp.LValue;

import java.util.Map;

public class EqNode implements LNode {

    private LNode lhs;
    private LNode rhs;

    public EqNode(LNode lhs, LNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Object render(Map<String, Object> variables) {

        Object a = lhs.render(variables);
        Object b = rhs.render(variables);

        return LValue.areEqual(a, b);

    }
}