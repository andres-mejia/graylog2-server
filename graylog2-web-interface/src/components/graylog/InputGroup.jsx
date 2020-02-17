import { memo } from 'react';
// eslint-disable-next-line no-restricted-imports
import { InputGroup as BootstrapInputGroup } from 'react-bootstrap';
import styled from 'styled-components';
import { lighten } from 'polished';

const InputGroup = memo(styled(BootstrapInputGroup)(({ theme }) => css`
  .input-group-addon {
    color: ${lighten(0.30, theme.color.primary.tre)};
    background-color: ${theme.color.primary.due};
    border-color: ${theme.color.secondary.tre};
  }
`));

InputGroup.Addon = memo(BootstrapInputGroup.Addon);
InputGroup.Button = memo(BootstrapInputGroup.Button);

export default InputGroup;
