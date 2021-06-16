/* eslint-disable import/prefer-default-export */
import styled from "styled-components";

export const Container = styled.div`
  padding: 2px;
  margin-left: 32px;

  span {
    color: #666;

    & + span {
      color: #333;
    }
  }

  & + & {
    margin-top: 8px;
  }
`;
